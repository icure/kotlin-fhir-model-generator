//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.specimendefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specimen in container intended for testing by lab
 *
 * Specimen conditioned in a container as expected by the testing laboratory.
 *
 * @param id Unique id for inter-element referencing
 * @param isDerived Primary or secondary specimen
 * @param type Type of intended specimen
 * @param preference preferred | alternate
 * @param container The specimen's container
 * @param requirement Specimen requirements
 * @param retentionTime Specimen retention time
 */
@SerialName("SpecimenDefinitionTypeTested")
@Serializable
public data class SpecimenDefinitionTypeTested(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Primary or secondary specimen
   */
  public val isDerived: Boolean? = null,
  /**
   * Type of intended specimen
   */
  public val type: CodeableConcept? = null,
  /**
   * preferred | alternate
   */
  public val preference: String? = null,
  /**
   * The specimen's container
   */
  public val container: SpecimenDefinitionTypeTestedContainer? = null,
  /**
   * Specimen requirements
   */
  public val requirement: String? = null,
  /**
   * Specimen retention time
   */
  public val retentionTime: Duration? = null,
  public val rejectionCriterion: List<CodeableConcept> = emptyList(),
  public val handling: List<SpecimenDefinitionTypeTestedHandling> = emptyList(),
) : BackboneElement
