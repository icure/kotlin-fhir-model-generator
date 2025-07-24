//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.datarequirement

import com.icure.fhir.mapping.domain.fhir.r4.Element
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a required data item
 *
 * Describes a required data item for evaluation in terms of the type of data, and optional code or
 * date-based filters of the data.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of the required data
 * @param subjectCodeableConcept E.g. Patient, Practitioner, RelatedPerson, Organization, Location,
 * Device
 * @param subjectReference E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
 * @param limit Number of results
 */
@SerialName("DataRequirement")
@Serializable
public data class DataRequirement(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * The type of the required data
   */
  public val type: String? = null,
  public val profile: List<String> = emptyList(),
  /**
   * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
   */
  public val subjectCodeableConcept: CodeableConcept? = null,
  /**
   * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
   */
  public val subjectReference: Reference? = null,
  public val mustSupport: List<String> = emptyList(),
  public val codeFilter: List<DataRequirementCodeFilter> = emptyList(),
  public val dateFilter: List<DataRequirementDateFilter> = emptyList(),
  /**
   * Number of results
   */
  public val limit: Int? = null,
  public val sort: List<DataRequirementSort> = emptyList(),
) : Element
