//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.detectedissue

import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Step taken to address
 *
 * Indicates an action that has been taken or is committed to reduce or eliminate the likelihood of
 * the risk identified by the detected issue from manifesting.  Can also reflect an observation of
 * known mitigating factors that may reduce/eliminate the need for any action.
 *
 * @param id Unique id for inter-element referencing
 * @param action What mitigation?
 * @param date Date committed
 * @param author Who is committing?
 */
@SerialName("DetectedIssueMitigation")
@Serializable
public data class DetectedIssueMitigation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What mitigation?
   */
  public val action: CodeableConcept,
  /**
   * Date committed
   */
  public val date: String? = null,
  /**
   * Who is committing?
   */
  public val author: Reference? = null,
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
