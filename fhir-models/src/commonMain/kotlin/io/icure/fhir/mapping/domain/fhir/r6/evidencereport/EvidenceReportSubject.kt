//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.evidencereport

import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Focus of the report
 *
 * Specifies the subject or focus of the report. Answers "What is this report about?".
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("EvidenceReportSubject")
@Serializable
public data class EvidenceReportSubject(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val characteristic: List<EvidenceReportSubjectCharacteristic> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
